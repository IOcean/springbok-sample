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
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringApplicationConfiguration(classes = SpringbokSampleApplication.class)
public class UserIntegrationTest extends SecuredIntegrationTest {
    
    @WithMockUser(roles = "USER")
    @Test
    public void testDeleteUserWithoutAdminPermission() throws Exception {
        mockMvc
                .perform(delete(API_ROOT_PATH + "/users")
                        .contentType(MediaType.APPLICATION_JSON))
                .andDo(MockMvcResultHandlers.print())
                .andExpect(status().isForbidden());
    }

    @WithMockUser(roles = "ADMIN")
    @Test
    public void testDeleteUserOk() throws Exception {
        mockMvc
                .perform(delete(API_ROOT_PATH + "/users")
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isGone());
    }
    
}
