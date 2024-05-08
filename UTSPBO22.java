package uts.pbo22;

/**
 *
 * @author ricat
 */
public class UTSPBO22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            BankAccount bankingSystem    = new BankAccount();
            bankingSystem.mainmenu();
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    
}
