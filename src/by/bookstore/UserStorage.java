package by.bookstore;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class UserStorage {




    private static final int ID_INDEX = 0;
    private static final int NAME_INDEX = 1;
    private static final int LOGIN_INDEX = 2;
    private static final int PASSWORD_INDEX = 3;

    public static void main(String[] args) {

           

//        String a = "%d %s %s %s";
//
//        String artem = String.format(a, 1, "Test", "test", "test");
//
//        System.out.println(artem);


        UserStorage userStorage = new UserStorage();
//        userStorage.save(new User(1, "Test", "test", "test"));
//        userStorage.delete(3);
//        userStorage.updateNameById(2, "New");
        userStorage.updateLoginById(2, "New");
        userStorage.updatePasswordById(2, "New");
        userStorage.delete("test1");
    }

    public void save(User user) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder
                .append(user.getId()).append(" ")
                .append(user.getName()).append(" ")
                .append(user.getLogin()).append(" ")
                .append(user.getPassword()).append(" ");
        String userString = stringBuilder.toString();

        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter("users.txt", true);
            fileWriter.write(userString);
            fileWriter.write("\n");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void delete(int id) {
        List<User> all = getAll();
        for (int i = 0; i < all.size(); i++) {
            if (all.get(i).getId() == id){
                all.remove(i);
                break;
            }
        }

        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter("users.txt");
            for (User user : all) {
                fileWriter.write(String.format("%d %s %s %s", user.getId(), user.getName(), user.getLogin(), user.getPassword()));
                fileWriter.write("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void delete(String login) {
        List<User> all = getAll();
        for (int i = 0; i < all.size(); i++) {
            if (all.get(i).getLogin().equals(login)){
                all.remove(i);
                break;
            }
        }
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter("users.txt");
            for (User user : all) {
                fileWriter.write(String.format("%d %s %s %s", user.getId(), user.getName(), user.getLogin(), user.getPassword()));
                fileWriter.write("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void updateNameById(int id, String name) {
        List<User> all = getAll();
        for (int i = 0; i < all.size(); i++) {
            if (all.get(i).getId() == id){
                all.get(i).setName(name);
                break;
            }
        }

        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter("users.txt");
            for (User user : all) {
                fileWriter.write(String.format("%d %s %s %s", user.getId(), user.getName(), user.getLogin(), user.getPassword()));
                fileWriter.write("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    public void updateLoginById(int id, String login) {
        List<User> all = getAll();
        for (int i = 0; i < all.size(); i++) {
            if (all.get(i).getId() == id){
                all.get(i).setLogin(login);
                break;
            }
        }

        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter("users.txt");
            for (User user : all) {
                fileWriter.write(String.format("%d %s %s %s", user.getId(), user.getName(), user.getLogin(), user.getPassword()));
                fileWriter.write("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    public void updatePasswordById(int id, String password) {
        List<User> all = getAll();
        for (int i = 0; i < all.size(); i++) {
            if (all.get(i).getId() == id){
                all.get(i).setPassword(password);
                break;
            }
        }

        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter("users.txt");
            for (User user : all) {
                fileWriter.write(String.format("%d %s %s %s", user.getId(), user.getName(), user.getLogin(), user.getPassword()));
                fileWriter.write("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    public User getById(int id) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("users.txt"));
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] s = line.split(" ");
                int id1 = Integer.parseInt(s[ID_INDEX]);
                if (id1 == id) {
                    return new User(id1, s[NAME_INDEX], s[LOGIN_INDEX], s[PASSWORD_INDEX]);
                }
            }
        } catch (IOException e) {

        }
        return null;
    }

    public User getByLogin(String login) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("users.txt"));
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] s = line.split(" ");
                if (s[LOGIN_INDEX].equals(login)) {
                    return new User(Integer.parseInt(s[ID_INDEX]), s[NAME_INDEX], s[LOGIN_INDEX], s[PASSWORD_INDEX]);
                }
            }
        } catch (IOException e) {

        }
        return null;
    }

    public List<User> getAll() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("users.txt"));
            String line;
            List<User> userList = new ArrayList<>();
            while ((line = bufferedReader.readLine()) != null) {
                String[] s = line.split(" ");
                userList.add(new User(Integer.parseInt(s[ID_INDEX]), s[NAME_INDEX], s[LOGIN_INDEX], s[PASSWORD_INDEX]));
            }
            return userList;
        } catch (IOException e) {

        }
        return null;
    }

    public List<User> getAllByName(String name) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("users.txt"));
            String line;
            List<User> nameList = new ArrayList<>();
            while ((line = bufferedReader.readLine()) != null) {
                String[] s = line.split(" ");
                if (s[NAME_INDEX].equals(name)) {
                    nameList.add(new User(Integer.parseInt(s[ID_INDEX]), s[NAME_INDEX], s[LOGIN_INDEX], s[PASSWORD_INDEX]));
                }
            }
            return nameList;
        } catch (IOException e) {

        }
        return null;
    }

    public boolean contains(int id) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("users.txt"));
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] s = line.split(" ");
                if (Integer.parseInt(s[ID_INDEX]) == id) return true;
            }
        } catch (IOException e) {

        }
        return false;
    }

    public boolean contains(String login) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("users.txt"));
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] s = line.split(" ");
                if (s[LOGIN_INDEX].equals(login)) return true;
            }
        } catch (IOException e) {

        }
        return false;
    }
}
