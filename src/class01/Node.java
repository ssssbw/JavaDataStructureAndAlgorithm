package class01;

/**
 * @author sbw
 * @version 1.0
 * @description TODO
 * @create 2021-10-26 18:58
 */
public class Node
{
	public int data;
	public Node next;

	public Node(int data)
	{
		this.data = data;
	}

	public void addNode(Node newNode)
	{
		if(this.next == null)
		{
			this.next = newNode;
		}
		else
		{
			this.next.addNode(newNode);
		}
	}

	public void addData(int data)
	{
		Node newNode = new Node(data);
		addNode(newNode);
	}
}

class SolutionOfCommonPart
{
	public static void main(String[] args)
	{
		Node node1 = new Node(2);
		node1.addData(3);
		node1.addData(4);
		node1.addData(6);
		node1.addData(7);
		node1.addData(9);

		Node node2 = new Node(3);
		node2.addData(5);
		node2.addData(6);
		node2.addData(7);
		node2.addData(9);
		node2.addData(10);

		printCommonPart(node1, node2);
	}

	public static void printCommonPart(Node head1, Node head2)
	{
		System.out.print("Common Part: ");
		while (head1 != null && head2 != null)
		{
			if(head1.data < head2.data)
			{
				head1 = head1.next;
			}
			else if(head1.data > head2.data)
			{
				head2 = head2.next;
			}
			else
			{
				System.out.print(head1.data + " ");
				head1 = head1.next;
				head2 = head2.next;
			}
		}
	}
}