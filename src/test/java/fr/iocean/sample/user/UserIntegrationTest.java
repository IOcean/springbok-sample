package fr.iocean.sample.user;

import fr.iocean.framework.test.integration.SecuredIntegrationTest;
import fr.iocean.sample.SpringbokSampleApplication;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.http.MediaType;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.testng.annotations.Test;

import static fr.iocean.sample.SpringbokSampleApplication.API_ROOT_PATH;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringApplicationConfiguration(classes = SpringbokSampleApplication.class)
public class UserIntegrationTest extends SecuredIntegrationTest {

    @WithMockUser(roles = "VIEW")
    @Test
    public void testDeleteUserWithoutDeletePermission() throws Exception {
        mockMvc
                .perform(delete(API_ROOT_PATH + "/users")
                        .contentType(MediaType.APPLICATION_JSON))
                .andDo(MockMvcResultHandlers.print())
                .andExpect(status().isForbidden());
    }

    @WithMockUser(roles = "DELETE")
    @Test
    public void testDeleteUserOk() throws Exception {
        mockMvc
                .perform(delete(API_ROOT_PATH + "/users")
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isGone());
    }

    @WithMockUser(roles = "VIEW")
    @Test
    public void testSearch() throws Exception {
        this.mockMvc.perform(get("/api/users/search").contentType(
                MediaType.APPLICATION_JSON).characterEncoding("UTF-8")
                .param("firstName", "John")
                .param("lastName", "Scur"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.content[0].firstName").value("Johnathan"))
                .andExpect(jsonPath("$.numberOfElements").value(1))
                .andExpect(jsonPath("$.totalElements").value(1));
    }

    @WithMockUser(roles = "VIEW")
    @Test
    public void testSearchPaginated() throws Exception {
        this.mockMvc.perform(get("/api/users/search").contentType(
                MediaType.APPLICATION_JSON).characterEncoding("UTF-8")
                .param("properties", "firstName")
                .param("direction", "asc"))
                .andDo(MockMvcResultHandlers.print())
                .andExpect(status().isOk());
    }

    @WithMockUser(roles = "VIEW")
    @Test
    public void testSearchActive() throws Exception {
        this.mockMvc.perform(get("/api/users/search").contentType(
                MediaType.APPLICATION_JSON).characterEncoding("UTF-8")
                .param("active", "false"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.numberOfElements").value(1))
                .andExpect(jsonPath("$.totalElements").value(1));
    }

}
