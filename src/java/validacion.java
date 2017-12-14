/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Zeus
 */
public class validacion {
  static int val = 0;
  static public int validasion(String P){
  if(P.equals("alumno"))
    val = 2;
  else if(P.equals("maestro"))
    val = 1;
  else if(P.equals("director"))
    val = 3;
  else
    val = 0;

  return val;
  }
}