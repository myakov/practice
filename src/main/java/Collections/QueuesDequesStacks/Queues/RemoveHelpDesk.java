package Collections.QueuesDequesStacks.Queues;


import Collections.QueuesDequesStacks.Category;
import Collections.QueuesDequesStacks.Customer;
import Collections.QueuesDequesStacks.Enquiry;

import java.util.ArrayDeque;
import java.util.Queue;

public class RemoveHelpDesk {
    private final Queue<Enquiry> enquiries = new ArrayDeque<>();

    public void enquire(final Customer customer, final Category category) {
        enquiries.add(new Enquiry(customer, category));
    }

    public void processAllEnquires() {
        while (!enquiries.isEmpty()) {
            final Enquiry enquiry = enquiries.remove();
            enquiry.getCustomer().reply("Have you tried turning it off and on again?");
        }
    }

    public static void main(String[] args) {
        RemoveHelpDesk helpDesk = new RemoveHelpDesk();

        helpDesk.enquire(Customer.JACK, Category.PHONE);
        helpDesk.enquire(Customer.JILL, Category.PRINTER);

        helpDesk.processAllEnquires();
    }
}
