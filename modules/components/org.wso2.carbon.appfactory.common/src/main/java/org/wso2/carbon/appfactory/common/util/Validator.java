package org.wso2.carbon.appfactory.common.util;

/**
 * Utilities for validation
 */
public class Validator {

    /**
     * Check whether input is including invalid chars
     *
     * @param applicationName name of the applicationName
     * @return the input string is valid or invalid
     */
    public static boolean validateInput(String applicationName) {
        String allowedCharPattern = ".*\\W";
        boolean isValidChar = applicationName.matches(allowedCharPattern);
        return isValidChar;

    }

    /**
     * Check whether application version is valid
     *
     * @param applicationVersion version of the application
     * @return application version is valid or not
     */
    public static boolean validateApplicationVersion(String applicationVersion) {
        String validNewVersionPattern = "^(\\d{1,2}\\.){2}(\\d{1,5})$";
        boolean isValid = false;
        boolean isValidApplicationVersion = validateInput(applicationVersion);
        //check either application is mach the patter or default version(trunk)
        if (applicationVersion.matches(validNewVersionPattern) || isValidApplicationVersion) {
            isValid = true;
        }
        return isValid;
    }

}
