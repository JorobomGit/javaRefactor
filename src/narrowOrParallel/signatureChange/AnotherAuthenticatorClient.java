package narrowOrParallel.signatureChange;

public class AnotherAuthenticatorClient {
    public void unusedClientCode() {
        try {
            new AuthenticationService().isAuthenticated(new Identifier(3545));
        } catch (Exception e) {
            // ignored
        }
    }
}
