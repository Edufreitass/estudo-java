//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//@Service
//public class StrongPasswordService {
//
//    @Autowired
//    private ConfigurationService configurationService;
//
//    // Example
//    public void check(final String password, final Integer companyId){
//        final ConfigurationDTO companyConfiguration = configurationService.findByCompanyId(companyId);
//        if (companyConfiguration.isUseStrongPassword()) {
//            StrongPassword.INSTANCE.validate(password);
//        }
//    }
//}
