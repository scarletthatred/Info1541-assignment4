package  com.example.customersupport;

import java.util.Map;

public class Ticket {
private String customerName;
private String subject;
private String bodyTicket;
private Map<String, Ticket> attachments;

   public Ticket(){
    super();
   }

    public Ticket(String customerName, String subject, String bodyTicket, Map<String, Ticket> attachments) {
        this.customerName = customerName;
        this.subject = subject;
        this.bodyTicket = bodyTicket;
        this.attachments = attachments;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getBodyTicket() {
        return bodyTicket;
    }

    public void setBodyTicket(String bodyTicket) {
        this.bodyTicket = bodyTicket;
    }

    public Map<String, Ticket> getAttachments() {
        return attachments;
    }

    public void setAttachments(Map<String, Ticket> attachments) {
        this.attachments = attachments;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "customerName='" + customerName + '\'' +
                ", subject='" + subject + '\'' +
                ", bodyTicket='" + bodyTicket + '\'' +
                ", attachments=" + attachments +
                '}';
    }

    public void addAttachment(){

    }
    public void getNumberOfAttachments(){

    }
    public void getIndividualAttachment(int index){

    }
    public void getAllAttachments(){

    }
}