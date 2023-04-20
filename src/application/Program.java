package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import model.entities.Product;
import model.services.CalculationService;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		List<Product> list = new ArrayList<>();
		
		String path = "C:\\Users\\leiss\\Documents\\Temp\\01.WS-ECLIPSE\\Generics-product-expensive\\product-list.csv";

		try (BufferedReader br = new BufferedReader(new FileReader(path))){
			
			String line = br.readLine();
			while (line != null) {
				
				String[] fields = line.split(",");
				
				String productName = fields[0];
				Double productPrice = Double.parseDouble(fields[1]);
				list.add(new Product(productName, productPrice));
				line = br.readLine();
			}
			
			Product x = CalculationService.max(list);
			
			
			System.out.println("Max: ");
			System.out.println(x);
		}
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}

}
