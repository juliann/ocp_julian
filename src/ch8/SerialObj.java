package ch8;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.fasterxml.jackson.databind.ObjectMapper;

import helper.SNP;

public class SerialObj {

	static class TestClass implements Serializable{
		private int id;
		InnerC c = new InnerC();
		
		static class InnerC{
			
		}
	}
	static List<SNP> listOfGenomeData = new ArrayList<>();

	public static void main(String[] args) {
		read();
		write();
		read2();
//		write2();
//		System.out.println(listOfGenomeData.size());
	//	writeXml();
		//readXml();
		// writeJson();
		// readJson();
	}

	private static void write2() {
	
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("testWrong.txt"))){
			TestClass c1 = new TestClass();
			c1.id=3;
			oos.writeObject(c1);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	private static void read2() {
		try(ObjectInputStream ojs = new ObjectInputStream(new BufferedInputStream(new FileInputStream("test.txt")))){
			System.out.println("hi");
			Object obj = ojs.readObject();
			if (obj instanceof List) {
			List<SNP> listOfGenomeData2 = (List<SNP>) obj;
			
			System.out.println(listOfGenomeData2.get(1));
				System.out.println(listOfGenomeData.get(1));
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	private static void write() {
		try(ObjectOutputStream ojs = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("test.txt")))){
			
			ojs.writeObject(listOfGenomeData.stream().limit(100).collect(Collectors.toList()));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	private static void readJson() {
		try (FileInputStream fis = new FileInputStream("snp.json")) {
			// create object mapper instance
			ObjectMapper mapper = new ObjectMapper();

			// convert JSON array to list of books
			List<SNP> books = Arrays.asList(mapper.readValue(fis, SNP[].class));

			// print books
			books.stream().limit(10).forEach(System.out::println);
		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

	

	private static void writeJson() {

		ObjectMapper obj = new ObjectMapper();
		try {
			// for (SNP a: listOfGenomeData) {
			BufferedOutputStream os = new BufferedOutputStream(new FileOutputStream(new File("snp.json")));
			
			obj.writeValue(os, listOfGenomeData);
			// }
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void writeXml() {

		try (FileOutputStream fos = new FileOutputStream("snp1.xml"); 
				XMLEncoder encoder = new XMLEncoder(fos);) {

			encoder.writeObject(listOfGenomeData.stream().limit(100).collect(Collectors.toList()));
//			for (SNP snp : listOfGenomeData) {
//				encoder.writeObject(snp);
//			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}
	@SuppressWarnings("unchecked")
	private static void readXml() {
		List<SNP> listOfGenomeDataFromXml = new ArrayList<>();

		try (FileInputStream fis = new FileInputStream("snp1.xml");
				XMLDecoder decoder = new XMLDecoder(fis);) {

			listOfGenomeDataFromXml = (List<SNP>) decoder.readObject();
			System.out.println(listOfGenomeDataFromXml);
//			SNP a,b;
//			 a = (SNP)decoder.readObject();
//			  System.out.println(a);
//			  b = (SNP)decoder.readObject();
//			  System.out.println(b);
//			  System.out.println("hi");
			

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	static void read() {

		Path genes = Paths.get("E:\\gdocks", "Downloads", "ManuSporny-genome.txt");

		try (Stream<String> stream = Files.lines(genes)) {
			stream.filter(lines -> lines.startsWith("#") == false).forEach(line -> {
				String[] arr = line.split("\t");
				SNP snp = new SNP(arr[0], arr[1], Long.parseLong(arr[2]), arr[3]);
				listOfGenomeData.add(snp);

			});

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}
	}
}
