package Calendar_2008;
/**
 * ���2008��������Ҫ�����·ݡ����������ڡ�ͳ�Ʋ����2008�����ڵĸ�λ�����Ӧ������ǡ����ͬ��������
 * @author JMbaozi
 *
 */
public class calendar_2008 {
	public static void main(String[] args) {
		int[] date_data = {2,5,6,2,4,7,2,5,0,3,6,0};
		int[] space_data = {1,4,5,1,3,6,1,4,0,2,5,0};
		int[] days_data = {31,29,31,30,31,30,31,31,30,31,30,31};
		for(int i =0;i<12;i++) {
			System.out.printf("\t\t%d��\n",i+1);
			ShowCalendar(date_data[i],space_data[i],days_data[i]);
		}
	}
	public static void ShowCalendar(int date,int space,int days) {
		//date:��ʼ������;space:��ͷ�հ�����;days:һ���µ�����
		System.out.println("����һ\t���ڶ�\t������\t������\t������\t������\t������\t");
		for(int i=1;i<=days+space;i++) {
			if(i <= space) {
				System.out.printf("\t");
			}else if(i == space+1){
				System.out.printf("%d\t",1);
				if(date<7) {
					date += 1;
				}else {
					System.out.println('\n');
					date = 1;
				}
			}else if(date < 7) {
				System.out.printf("%d\t",i-space);
				date += 1;
			}else if(date == 7){
				System.out.printf("%d\n",i-space);
				date = 1;
			}
		}
		System.out.println('\n');
	}
}