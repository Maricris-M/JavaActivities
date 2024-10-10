package DiscountCalculation;

import java.util.Scanner;

public class Mariano_DiscountCalculation {
	
	static boolean isNewCustomer;
	static boolean hasLoyaltyCard;
	static boolean hasCoupon;
	static long start;
	static long end;

	public static void main(String[] args) {
		start = System.nanoTime();
		
		getInput();
		
		if (calculateDiscount() < 0) {
			System.out.println("\nImpossible");
		} else {
			System.out.println("\nTotal Discount: "+ calculateDiscount() +"%");
		}
		end = System.nanoTime();
		
		System.out.println("Elapsed Time: " + ((end - start) / 1000000));
	}
	
	public static void getInput() {
		Scanner keyboard = new Scanner(System.in);
		String customer;
		String loyaltyCard;
		String coupon;
		
		System.out.print("Are you a new customer? [Y/N]: ");
		customer = keyboard.next();
		System.out.print("Do you have a loyalty card? [Y/N]: ");
		loyaltyCard = keyboard.next();
		System.out.print("Do yu have a coupon? [Y/N]: ");
		coupon = keyboard.next();
		
		isNewCustomer = customer.equalsIgnoreCase("y") ? true: false;
		hasLoyaltyCard = loyaltyCard.equalsIgnoreCase("y") ? true: false;
		hasCoupon = coupon.equalsIgnoreCase("y") ? true : false;
		
		keyboard.close();
	}
	
	public static int calculateDiscount() {
		int discount = 0;
		int newCustomerDiscount = 15;
		int loyaltyCardDiscount = 10;
		int couponDiscount = 20;
	
		// Set the discount values
		if (hasCoupon) {
			discount = couponDiscount; // 20%
			if (hasLoyaltyCard) {
				discount = loyaltyCardDiscount + couponDiscount; // 30%
			}
		}
		if (!hasCoupon){
			discount = newCustomerDiscount; // 15%
			if (hasLoyaltyCard) {
				discount = loyaltyCardDiscount; // 10%
			}
		}
		
		// Set -1 as error value
		if (isNewCustomer && hasLoyaltyCard && (hasCoupon || !hasCoupon)) {
			discount = -1;	
		}
		
		// Set 0 as return value
		if (!isNewCustomer && !hasLoyaltyCard && !hasCoupon) {
			discount = 0;	
		}
		
		return discount;
	}
}