import java.io.*;

public class WordCount {
    public static void main(String[] args) throws Exception {
        String path = "C:\\Users\\xyhf\\IdeaProjects\\untitled\\src\\file.txt";

        int Char = 0;
        int Word = 0;

        InputStreamReader in = new InputStreamReader(new FileInputStream(path));
        BufferedReader br = new BufferedReader(in);
        //����io������ȡ�ļ�
        while (br.read() != -1)//read()=-1�������ݶ�ȡ���
        {
            String s = br.readLine();
            Char += s.length();//�����ж��ַ��ĸ������ַ������͵����ַ�����
            for (int i = 0; i < s.length(); i++) {
                char item = s.charAt(i);
                if (item == ' ' || item == ',') //����ͳ�Ƶ��ʵĸ�����������ʱ�����ո�򶺺�ʱ��������һ
                {
                    Word++;
                }

            }
            Word += 1;
        }
        //�ر��ļ�
        in.close();
        br.close();

        for (String flag : args) {
            switch (flag) {
                case "-c":
                    System.out.println("�ַ�����" + Char);
                    break;
                case "-w":
                    System.out.println("��������" + Word);
                    break;
            }
        }
    }
}

