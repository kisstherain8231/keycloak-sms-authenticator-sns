package six.six.keycloak.models.credential;


import java.io.IOException;
import org.keycloak.credential.CredentialModel;
import org.keycloak.models.credential.dto.PasswordCredentialData;
import org.keycloak.models.credential.dto.PasswordSecretData;
import org.keycloak.util.JsonSerialization;

public class SMSCredentialModel extends CredentialModel {

   /* public static final String TYPE = "SMS_OTP";
    public static final String PASSWORD_HISTORY = "password-history";

    private final PasswordCredentialData credentialData;
    private final PasswordSecretData secretData;

    private SMSCredentialModel(PasswordCredentialData credentialData, PasswordSecretData secretData) {
        this.credentialData = credentialData;
        this.secretData = secretData;
    }

    public static org.keycloak.models.credential.PasswordCredentialModel createFromValues(String algorithm, byte[] salt, int hashIterations, String encodedPassword){
        PasswordCredentialData credentialData = new PasswordCredentialData(hashIterations, algorithm);
        PasswordSecretData secretData = new PasswordSecretData(encodedPassword, salt);

        org.keycloak.models.credential.PasswordCredentialModel passwordCredentialModel = new org.keycloak.models.credential.PasswordCredentialModel(credentialData, secretData);

        try {
            passwordCredentialModel.setCredentialData(JsonSerialization.writeValueAsString(credentialData));
            passwordCredentialModel.setSecretData(JsonSerialization.writeValueAsString(secretData));
            passwordCredentialModel.setType(TYPE);
            return passwordCredentialModel;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static org.keycloak.models.credential.PasswordCredentialModel createFromCredentialModel(CredentialModel credentialModel) {
        try {
            PasswordCredentialData credentialData = JsonSerialization.readValue(credentialModel.getCredentialData(),
                PasswordCredentialData.class);
            PasswordSecretData secretData = JsonSerialization.readValue(credentialModel.getSecretData(), PasswordSecretData.class);

            org.keycloak.models.credential.PasswordCredentialModel passwordCredentialModel = new org.keycloak.models.credential.PasswordCredentialModel(credentialData, secretData);
            passwordCredentialModel.setCreatedDate(credentialModel.getCreatedDate());
            passwordCredentialModel.setCredentialData(credentialModel.getCredentialData());
            passwordCredentialModel.setId(credentialModel.getId());
            passwordCredentialModel.setSecretData(credentialModel.getSecretData());
            passwordCredentialModel.setType(credentialModel.getType());
            passwordCredentialModel.setUserLabel(credentialModel.getUserLabel());

            return passwordCredentialModel;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    public PasswordCredentialData getPasswordCredentialData() {
        return credentialData;
    }

    public PasswordSecretData getPasswordSecretData() {
        return secretData;
    }
*/

}
