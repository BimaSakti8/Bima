package com.mycompany.apaaja;
import java.util.Scanner;

// Kelas untuk mengelola pembelian tiket
class Ticket {
    private String type;
    private double price;

    public Ticket(String type, double price) {
        this.type = type;
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }
}

// Kelas utama untuk menjalankan program
public class ConcertTicketBooking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Menyediakan pilihan tiket
        Ticket presale1 = new Ticket("Presale 1", 70000);
        Ticket presale2 = new Ticket("Presale 2", 120000);
        Ticket earlyBird = new Ticket("Early Bird", 50000);
        Ticket vip = new Ticket("VIP", 200000);

        System.out.println("Selamat datang di sistem pembelian tiket konser!");
        System.out.println("Pilihan tiket:");
        System.out.println("1. " + presale1.getType() + " - Rp " + presale1.getPrice());
        System.out.println("2. " + presale2.getType() + " - Rp " + presale2.getPrice());
        System.out.println("3. " + earlyBird.getType() + " - Rp " + earlyBird.getPrice());
        System.out.println("4. " + vip.getType() + " - Rp " + vip.getPrice());

        System.out.print("Silakan pilih jenis tiket (1-4): ");
        int choice = scanner.nextInt();

        Ticket selectedTicket = null;

        switch (choice) {
            case 1:
                selectedTicket = presale1;
                break;
            case 2:
                selectedTicket = presale2;
                break;
            case 3:
                selectedTicket = earlyBird;
                break;
            case 4:
                selectedTicket = vip;
                break;
            default:
                System.out.println("Pilihan tidak valid.");
                scanner.close();
                return;
        }

        System.out.print("Masukkan jumlah tiket yang ingin dibeli: ");
        int quantity = scanner.nextInt();

        double totalCost = selectedTicket.getPrice() * quantity;

        System.out.println("Anda telah memilih: " + selectedTicket.getType());
        System.out.println("Jumlah tiket: " + quantity);
        System.out.println("Total biaya: Rp " + totalCost);

        System.out.println("Terima kasih telah membeli tiket konser!");
        scanner.close();
    }
}