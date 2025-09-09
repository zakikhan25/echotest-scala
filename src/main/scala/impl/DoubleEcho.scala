package edu.luc.cs.cs371.echo
package impl

import main.Echo

class DoubleEcho extends Echo:
  def echo(msg: String) =
    if msg.isEmpty then msg   
    else msg + " " + msg      
end DoubleEcho
