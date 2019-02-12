package lib;

import java.io.Serializable;

public class Member implements Serializable
{
  private String _name;
  private int    _age;
  private char   _gender;
  private String _mail;

  private final static long serialVersionUID = 1L;

  /**
   *
   */
  public Member(String name, int age, char gender, String mail)
  {
    _name   = name;
    _age    = age;
    _gender = gender;
    _mail   = mail;
  }

  /**
   *
   */
  public String toString()
  {
    return "Name : " + _name + "\nAge : " + _age + "\nGender : " + _gender + "\nMail : " + _mail;
  }
}
