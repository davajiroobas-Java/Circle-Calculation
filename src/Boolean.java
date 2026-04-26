
public class Boolean {
    public static void main(StringManipulation[] args) {

        // Boolean variables representing user states
        boolean isLoggedIn = true;
        boolean hasPaid = false;

        // Check if the user is logged in
        if (isLoggedIn) {
            System.out.println("The user is logged in.");
        } else {
            System.out.println("The user is not logged in.");
        }

        // Check if the user has paid
        if (hasPaid) {
            System.out.println("The user has paid for the service.");
        } else {
            System.out.println("The user has not paid yet.");
        }

        // Combined conditions
        if (isLoggedIn && hasPaid) {
            System.out.println("Full access granted!");
        } else if (isLoggedIn && !hasPaid) {
            System.out.println("Limited access – please complete payment.");
        } else {
            System.out.println("Please log in to access the service.");
        }
    }
}

