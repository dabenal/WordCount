import java.io.*;

public class WordCount {
    public static void main(String[] args) throws Exception {
        String path = "C:\\Users\\xyhf\\IdeaProjects\\untitled\\src\\file.txt";

        int Char = 0;
        int Word = 0;

        InputStreamReader in = new InputStreamReader(new FileInputStream(path));
        BufferedReader br = new BufferedReader(in);
        //采用io流来读取文件
        while (br.read() != -1)//read()=-1代表数据读取完毕
        {
            String s = br.readLine();
            Char += s.length();//用来判断字符的个数，字符个数就等于字符长度
            for (int i = 0; i < s.length(); i++) {
                char item = s.charAt(i);
                if (item == ' ' || item == ',') //用来统计单词的个数，当遍历时遇到空格或逗号时单词数加一
                {
                    Word++;
                }

            }
            Word += 1;
        }
        //关闭文件
        in.close();
        br.close();

        for (String flag : args) {
            switch (flag) {
                case "-c":
                    System.out.println("字符数：" + Char);
                    break;
                case "-w":
                    System.out.println("单词数：" + Word);
                    break;
            }
        }
    }
}

