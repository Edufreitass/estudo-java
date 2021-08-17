//public enum StrongPassword {
//    INSTANCE;
//
//    private static final String REGEX_NUMBERS = ".*([0-9]).*";
//    private static final String REGEX_SMALL_LETTERS = ".*([a-z]).*";
//    private static final String REGEX_CAPITAL_LETTERS = ".*([A-Z]).*";
//
//    public void validate(final String password) {
//        isPasswordBiggerThanEightCharacter(password);
//        isPasswordWithCapitalLetters(password);
//        isPasswordWithSmallLetters(password);
//        isPasswordWithNumbers(password);
//    }
//
//    private void isPasswordWithNumbers(final String password) {
//        if(!password.matches(REGEX_NUMBERS)){
//            throw new Exception();
//        }
//    }
//
//    private void isPasswordWithSmallLetters(final String password) {
//        if(!password.matches(REGEX_SMALL_LETTERS)){
//            throw new Exception();
//        }
//    }
//
//    private void isPasswordWithCapitalLetters(final String password) {
//        if(!password.matches(REGEX_CAPITAL_LETTERS)){
//            throw new Exception();
//        }
//    }
//
//    private void isPasswordBiggerThanEightCharacter(final String password) {
//        if (password.length() < 8) {
//            throw new Exception();
//        }
//    }
//}
