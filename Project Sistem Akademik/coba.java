import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class coba {
    private static Map<String, User> userDatabase = new HashMap<>();

    public static void main(String[] args) {
        // Inisialisasi beberapa pengguna
        User user1 = new User("mahasiswa1", "password1");
        User user2 = new User("mahasiswa2", "password2");
        User user3 = new User("dosen1", "securePass");
        userDatabase.put(user1.getUsername(), user1);
        userDatabase.put(user2.getUsername(), user2);
        userDatabase.put(user3.getUsername(), user3);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Selamat datang di Sistem Informasi Akademik (SIAKAD)!");
        System.out.print("Username: ");
        String username = scanner.nextLine();

        System.out.print("Password: ");
        String password = scanner.nextLine();

        User currentUser = authenticateUser(username, password);

        if (currentUser != null) {
            System.out.println("Login berhasil. Selamat datang, " + currentUser.getUsername() + "!");
            if (currentUser.getRole().equals("mahasiswa")) {
                System.out.println("Data Anda: " + currentUser.getStudentData());
            } else if (currentUser.getRole().equals("dosen")) {
                System.out.println("Data Anda: " + currentUser.getTeacherData());
            }
        } else {
            System.out.println("Login gagal. Kredensial tidak valid.");
        }
    }

    public static User authenticateUser(String username, String password) {
        if (userDatabase.containsKey(username)) {
            User user = userDatabase.get(username);
            if (user.getPassword().equals(password)) {
                return user;
            }
        }
        return null;
    }
}

class User {
    private String username;
    private String password;
    private String role;
    private String studentData;
    private String teacherData;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
        if (username.startsWith("mahasiswa")) {
            this.role = "mahasiswa";
            this.studentData = "Data mahasiswa untuk " + username;
        } else if (username.startsWith("dosen")) {
            this.role = "dosen";
            this.teacherData = "Data dosen untuk " + username;
        }
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getRole() {
        return role;
    }

    public String getStudentData() {
        return studentData;
    }

    public String getTeacherData() {
        return teacherData;
    }
}