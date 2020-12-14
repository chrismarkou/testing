class UserDB {
    public static void main(String[] args) {
                <%@page contentType="text/html" pageEncoding="UTF-8"%>
          <!DOCTYPE html>
          <html>
              <head>
              <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
              <title>Open-Pages</title>
              </head>
              <body>
              <form method="post" action="/open-pages/comments.jsp">
                        User Name: <input type="text" name="userName">
                <br />
                        Password: <input type="password" name="password">
                <input type="submit" value="submit">
                <input type="reset" value="reset">
              </form>
              </body>
          </html>
        }
    public static void main(String[] args)
    {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "example");
            String sql = "SET PASSWORD FOR 'root'@'localhost' = PASSWORD('test')";
            Statement stmt = conn.createStatement();
            stmt.executeQuery(sql);
            stmt.close();
            conn.close();
            System.out.println("Password is changed successfully!");
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }

          public void loginPost(View view){
                String username = usernameField.getText().toString();
                String password = passwordField.getText().toString();
                new SigninActivity().execute(username, password);
          }
    boolean changePassword(){
        String pass=JOptionPane.showInputDialog(null, "Enter old password: ", "Input", JOptionPane.QUESTION_MESSAGE);
        if(pass.equals(Password)) {
            String newpass=JOptionPane.showInputDialog(null,
                    "Enter new password: ", "Input", JOptionPane.QUESTION_MESSAGE);
            String connewpass=JOptionPane.showInputDialog(null,
                    "Enter confirming new password: ", "Input",
                    JOptionPane.QUESTION_MESSAGE);
            if(newpass.equals(connewpass)){
                Password= newpass;
                JOptionPane.showMessageDialog(null, "password changed ", "message",
                        JOptionPane.INFORMATION_MESSAGE);
                return true;
            }
            else
                JOptionPane.showMessageDialog(null, "Wrong Conferm ", "message",
                        JOptionPane.INFORMATION_MESSAGE);

        }
        else
            JOptionPane.showMessageDialog(null, "Wrong password ", "message",
                    JOptionPane.INFORMATION_MESSAGE);

        return false;
    }
}






















    }
}