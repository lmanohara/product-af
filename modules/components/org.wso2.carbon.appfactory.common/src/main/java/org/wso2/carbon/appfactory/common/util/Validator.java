package org.wso2.carbon.appfactory.common.util;

/**
 * Utilities for validation
 */
public class Validator {

    /**
     * Check whether applicationName name includes special chars
     *
     * @param applicationName name of the applicationName
     * @return applicationName name valid or invalid
     */
    public static boolean validateApplicationName(String applicationName) {
        String specialCharPattern = ".*\\W";
        Boolean isValid;
        boolean isInvalidChar = applicationName.matches(specialCharPattern);
        isValid = !isInvalidChar;

        return isValid;

    }

}
