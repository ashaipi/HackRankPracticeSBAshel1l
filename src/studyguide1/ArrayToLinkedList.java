package studyguide1;
import java.util.LinkedList;

public class ArrayToLinkedList implements MyLinkList{
	LinkedList<String> arrayToList;
	LinkedList<String> reverseList;

	@Override
	public void convert(String[] a) {
		// TODO Auto-generated method stub
		arrayToList = new LinkedList<>();
		for (int i = 0; i < a.length; i++) {
			arrayToList.add(a[i]);
			System.out.printf("I have added the string: %s at the node: %d\n",a[i],i);
		}
		System.out.println("Original Linked List Order");
		for (int i = 0; i < arrayToList.size(); i++) {
			System.out.printf("%d element=%s\n",i,arrayToList.get(i));
		}
		
	}

	@Override
	public void replace(int idx) {
		// TODO Auto-generated method stub
		String str = arrayToList.get(idx);
		arrayToList.remove(idx);
		arrayToList.add(idx,null);
		System.out.printf("I have replaced the string: %s with a null string\n",str);
		
	}

	@Override
	public LinkedList<String> compact() {
		// TODO Auto-generated method stub
		for (int i = 0; i < arrayToList.size(); i++) {
			if(arrayToList.get(i)==null) arrayToList.remove(i);
		}
		return arrayToList;
	}

	@Override
	public void displayList() {
		// TODO Auto-generated method stub
		reverseLinkedList();
		System.out.println("Reversed Linked List Order");
		for (int i = 0; i < reverseList.size(); i++)
			System.out.printf("%d element=%s\n",i,reverseList.get(i));
	}

	@Override
	public void reverseLinkedList() {
		// TODO Auto-generated method stub
		reverseList = new LinkedList<>();
		for (int i = arrayToList.size() - 1; i >= 0; i--)
			reverseList.add(arrayToList.get(i));
	}


}