package fr.iocean.sample.api.user.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import fr.iocean.framework.core.exception.PageRequestException;
import fr.iocean.framework.core.resource.controller.DeletableResourceController;
import fr.iocean.framework.core.util.PageUtils;
import fr.iocean.sample.api.user.model.User;
import fr.iocean.sample.api.user.model.UserSearch;
import fr.iocean.sample.api.user.service.UserService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import static fr.iocean.sample.SpringbokSampleApplication.API_ROOT_PATH;

@RestController
@RequestMapping(value = API_ROOT_PATH + "/users")
public class UserController extends DeletableResourceController<User, Long, UserService> {

    @PreAuthorize("hasRole('DELETE')")
    @Override
    public void deleteAll() {
        super.deleteAll();
    }

    @PreAuthorize("hasRole('VIEW')")
    @RequestMapping("search")
    public Page<User> search(
            @RequestParam(value = "active", required = false) Boolean active,
            @RequestParam(value = "firstName", required = false) String firstName,
            @RequestParam(value = "lastName", required = false) String lastName,
            @RequestParam(value = "firstOrLastName", required = false, defaultValue = "false") Boolean firstOrLastName,
            @RequestParam(value = "pageNumber", required = false, defaultValue = DEFAULT_PAGE_NUMBER) String pageNumber,
            @RequestParam(value = "pageSize", required = false, defaultValue = DEFAULT_PAGE_SIZE) String pageSize,
            @RequestParam(value = "direction", required = false, defaultValue = DEFAULT_PAGE_DIRECTION) String direction,
            @RequestParam(value = "properties", required = false, defaultValue = DEFAULT_PAGE_PROPERTIES) String... properties
    )
            throws JsonProcessingException, PageRequestException {
        Pageable pageRequest = PageUtils.newPageable(pageNumber, pageSize, direction, properties);

        UserSearch searchBean = service.createSearchBeanFromRequest(active, firstName, lastName, firstOrLastName);

        return service.search(pageRequest, searchBean);

    }
}
