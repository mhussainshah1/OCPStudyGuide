package ocp11.exam_1Z0_819;


import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.List;

/**
 * Your organization makes mlib. jar available to your cloud customers. 
 * While working on a code cleanup project for mlib.jar, you see this customer 
 * visible method:
 */

public class Q1 {

    public void setHostFailover(List<String> hostList) {
        AccessController.doPrivileged((PrivilegedAction<Void>) () -> {
            this.secureTransport.setHostFailover(hostList);
            return null;
        });
    }
}
/**
 * 
What change should you make to this method so that it satisfies the requirements for a customer visible method?
A) Add hostList = new ArrayList<>(hostList) ; before doPrivileged.
B) Remove the doPrivileged block.
C) Replace setHostFailover (hostList) with setHostFailover (Collections.unmodifiableList (hostList) ).
D) Enclose the doPrivileged block in a try-catch block.
 */
