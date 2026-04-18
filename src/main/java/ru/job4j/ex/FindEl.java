package ru.job4j.ex;

public class FindEl {
    public static int indexOf(String[] value, String key) throws UserInputException {
        int result = -1;
        for (int i = 0; i < value.length; i++) {
            if (key != null && key.equals(value[i])) {
                result = i;
                break;
            }
        }
        if (result == -1) {
            throw new UserInputException("ElementNotFoundException");
        }
        return result;
    }

    public static void main(String[] args) {
        String[] value = new String[]{"one", "two", "three"};
        String key = "three";
        try {
            System.out.println(indexOf(value, key));
        } catch (UserInputException e) {
            e.printStackTrace();
        }
    }
}
