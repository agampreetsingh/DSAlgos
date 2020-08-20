package practice.Additional;

import java.util.ArrayList;
import java.util.List;

public class SampleService {
	
	public static void main(String[] args) {
		
		SampleDTO d1 = new SampleDTO();
		d1.setId(1L);
		d1.setImage("Hello");
		SampleDTO d2 = new SampleDTO();
		d2.setId(2L);
		d2.setImage("Hello");
		SampleDTO d3 = new SampleDTO();
		d3.setId(3L);
		d3.setImage("Hello");
		SampleDTO d4 = new SampleDTO();
		d4.setId(4L);
		d4.setImage("Hello");
		d4.setDemo(new DemoDto("hello"));
		
		SampleRunner parentObj = new SampleRunner();
		List<SampleDTO> parentList = new ArrayList<>();
		
		parentList.add(d1);
		parentList.add(d2);
		parentList.add(d3);
		parentList.add(d4);
		parentObj.setSampleList(parentList);
		
	//	checkRunner(parentList);
		
		List<String> myList = new ArrayList<>();
		myList.add("adsa");
		myList.add("adfassa");
		myList.add("adsfasfa");
		myList.add("adsasa");
		myList.add("afasfdsa");
		myList.add("adfassa");
		myList.add("adsrewa");
		myList.add("adstrea");
		
		System.out.println(myList.toString());
		
		
		System.out.println(parentList);
	}

	private static void checkRunner(List<SampleDTO> parentList) {
		for(SampleDTO dto : parentList) {
			dto.setId(dto.getId()+10);
			dto.setImage("BYE");
			if(dto.getDemo()!=null)
			dto.getDemo().setA("Hi");
		}
	}

}
