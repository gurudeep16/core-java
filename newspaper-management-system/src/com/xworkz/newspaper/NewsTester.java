package com.xworkz.newspaper;

import com.xworkz.newspaper.dto.NewsPaperDTO;

public class NewsTester {
public static void main(String a[]){
		
		NewsPaperDTO np = new NewsPaperDTO();
		np.setName("Prajavani");
		np.setType("Daily");
		np.setPrice(6.50);
		np.setPublications("Deccan Herald");
		np.setLanguage("Kannada");
		
		System.out.println(np);

}
}
