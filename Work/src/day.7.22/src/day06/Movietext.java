package day06;

import java.util.Scanner;

public class Movietext {
	public static void main(String[] args) {
		Moviemanger manger = new Moviemanger();
		manger.showMainMenu();
		
		
	}
	}
		/*System.out.println("欢迎光临横店影视城");
		System.out.println("1,新增电影");
		System.out.println("2,查看电影");
		System.out.println("3,删除电影");
		System.out.println("4,退出");
		System.out.println("请选择");
		Scanner input  = new Scanner(System.in);
		int i = input.nextInt();
		switch (i) {
		case 1:
			System.out.println("1,新增电影");
			
			break;
		case 2:
			System.out.println("2,查看电影");
			
			
		case 3:
			System.out.println("3,删除电影");
			break;	
		default:
			System.out.println("4,退出");
			break;
		}
		String [] arr = new String[4];
		
		arr[0]="栀子花开";
		arr[1]="湄公河行动";
		arr[2]="栀子花开2";
		arr[3]="机械师";
        String [] arr01 = new String[3];
		
		arr01[0]="何炅";
		arr01[1]="陈凯歌";
		arr01[2]="郭达";
        String [] arr02 = new String[3];
		
		arr02[0]="李易峰";
		arr02[1]="啸天";
		arr02[2]="郭达斯坦森";
		int [] arr03 = new int[2];
			
		arr03[0]=120;
		arr03[1]=130;
		
		System.out.println("请输入电影名");
		Scanner sc  = new Scanner(System.in);
		String j = sc.next();
		for (String h:arr){
			if(j.equals(h)){
				System.out.println("您已选中"+j+"电影"+"请输入电影导演");	
				
			}
		Scanner sd  = new Scanner(System.in);	
		String d = sc.next();
		for (String h1:arr01){
			if(d.equals(h1)){
			    System.out.println("您已选中"+d+"导演"+"请输入电影主演");	
				}
		String z= sc.next();
		for (String h2:arr02){
			if(z.equals(h2)){
				System.out.println("您已选中"+z+"主演"+"请输入电影时长");	
				}
			}
		int s = sc.nextInt();
		for (int h3:arr03){
			if(s==h3){
				System.out.println("您已选中"+s+"时长");	
				}
			}
		switch (i) {
		case 1:
			System.out.println("1，新增电影");
			
			break;
		case 2:
			System.out.println("2,查看电影");
			
			
		case 3:
			System.out.println("3，删除电影");
			break;	
		default:
			System.out.println("4,退出");
			break;
		}
		}
			
		
	}
	}*/
