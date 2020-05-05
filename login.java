package no1;

/*
Nama      : Faridawati.
Kelas     : B2
hari/tgl  : Jumat, 1 Mei 2020
 */
public class login {
    public String username;
    public int password; 
    
    public login(String username, int password){
        this.username = username;
        this.password = password;
    }
}

class runlogin{
    public static void main(String[] args){
        login user = new login("Irma",12345);
        System.out.println("Username = "+user.username);
        System.out.println("Password = "+user.password);
    }
}