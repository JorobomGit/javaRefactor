package narrowOrParallel.signatureChange;

public class AuthenticationService {

    public boolean isAuthenticated(Identifier id){
        return id.getId() == 12345;
    }
}
