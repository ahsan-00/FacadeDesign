/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facadedesign;

/**
 *
 * @author MAH
 */
class ABC_Shop {
  public static void generateReports(String Billing, String Shipping) {
    Driver driver = null;
    switch(Billing) {
    case "Bag_1":
      driver = Page_1.generateBilleport();
      switch(Shipping) {
      case "Page_2":
        driver = Page_2.generateBilleport();
        break;
      case "junit":
        Firefox.generateJUnitReport(test, driver);
        break;
      }
    break;
    case "Bag_2":
      driver = Chrome.getChromeDriver();
      switch(report) {
      case "html":
        Chrome.generateHTMLReport(test, driver);
        break;
      case "junit":
        Chrome.generateJUnitReport(test, driver);
        break;
      }
    }
  }
}