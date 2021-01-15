package exceptions;

public class IllegalSettingExeption {
    public class IllegalSettingsException extends IllegalArgumentException {
        public IllegalSettingsException(String s) {
            super(s);
        }
    }
}
