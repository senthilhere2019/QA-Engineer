import java.util.PriorityQueue;


public class priorityQueueCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PriorityQueue<String> pque = new PriorityQueue<String>();
		pque.add("Vkm");
		pque.add("Nnpss");
		pque.add("Rish");
		
		//for(String obj:pque){
			System.out.println(pque);
		//}
			
		pque.offer("kkkk");
		
		System.out.println(pque);
		
		pque.element();
		pque.remove();
		System.out.println(pque);
		
	}

}
