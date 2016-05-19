import java.io.*;

class QueueProgram {

    public static void main(String arg[]) {
        DataInputStream get = new DataInputStream(System.in);
        int choice;
        QueueAction queue = new QueueAction();
        queue.getdata();
        System.out.println("Queue\n\n");
        try {
            do {
                System.out.println("1.Enqueue\n2.Dequeue\n3.Display\n4.Exit\n");
                System.out.println("Enter the Choice : ");
                choice = Integer.parseInt(get.readLine());
                switch (choice) {
                    case 1:
                        queue.enqueue();
                        break;
                    case 2:
                        queue.dequeue();
                        break;
                    case 3:
                        queue.display();
                        break;
                }
            } while (choice != 4);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
