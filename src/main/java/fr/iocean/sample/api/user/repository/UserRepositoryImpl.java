package fr.iocean.sample.api.user.repository;

import fr.iocean.framework.core.resource.repository.AbstractResourceRepository;
import fr.iocean.sample.api.user.model.User;
import fr.iocean.sample.api.user.model.UserSearch;
import org.apache.commons.lang3.StringUtils;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Junction;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;

import java.util.List;

public class UserRepositoryImpl extends AbstractResourceRepository<User> implements UserRepositoryCustom{
    
    @Override
    protected Class<User> getEntityClass() {
        return User.class;
    }

    @Override
    public PageImpl<User> search(Pageable pageable, UserSearch searchBean) {
        Criteria query = createSearchCriteria(pageable);
        query.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);
        constructQuerySearch(query, searchBean);
        Long count = count(searchBean);
        return createSearchResult(pageable, query, count);
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<User> findByProfile(Long profileId) {
        Query query = getSession().createQuery(""
                + "select pu.user "
                + "from ProfileUser pu "
                + "where pu.profile.id = :profileId ")
                .setParameter("profileId", profileId);
        return query.list();
    }
    
    private Long count(UserSearch searchBean) {
        Criteria query = getSession().createCriteria(entityClass).setProjection(Projections.countDistinct("id"));
        constructQuerySearch(query, searchBean);
        return (Long) query.uniqueResult();
    }

    private void constructQuerySearch(Criteria query, UserSearch searchBean) {

        if (searchBean.enabled != null) {
            query.add(Restrictions.eq("enabled", searchBean.enabled));
        }

        Junction or = null;
        if (searchBean.firstOrLastName != null && searchBean.firstOrLastName) {
            or = Restrictions.disjunction();
            query.add(or);
        }

        if (StringUtils.isNotBlank(searchBean.firstName)) {
            Criterion r = Restrictions.ilike("firstName", searchBean.firstName, MatchMode.ANYWHERE);
            if (searchBean.firstOrLastName != null && searchBean.firstOrLastName) {
                or.add(r);
            } else {
                query.add(r);
            }
        }

        if (StringUtils.isNotBlank(searchBean.lastName)) {
            Criterion r = Restrictions.ilike("lastName", searchBean.lastName, MatchMode.ANYWHERE);
            if (searchBean.firstOrLastName != null && searchBean.firstOrLastName) {
                or.add(r);
            } else {
                query.add(r);
            }
        }
    }

}
