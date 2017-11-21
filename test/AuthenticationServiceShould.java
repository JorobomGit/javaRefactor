import narrowOrParallel.signatureChange.AuthenticationService;
import narrowOrParallel.signatureChange.Identifier;
import org.junit.Assert;
import org.junit.Test;

public class AuthenticationServiceShould {

    @Test
    public void distinguish_administrator_role() throws Exception {
        AuthenticationService service = new AuthenticationService();
        Identifier adminId = new Identifier(12345);
        Assert.assertTrue(service.isAuthenticated(adminId));
    }
    @Test
    public void distinguish_non_admin_role() throws Exception {
        AuthenticationService service = new AuthenticationService();
        Identifier normalUserId = new Identifier(11111);
        Assert.assertFalse(service.isAuthenticated(normalUserId));
    }
}
