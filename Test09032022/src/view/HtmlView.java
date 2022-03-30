package view;

import java.io.PrintWriter;

public class HtmlView {
	public static String  doc = "<!DOCTYPE html>" + 
			"<html lang=\"en\">" + 
			"<head>" + 
			"    <meta charset=\"UTF-8\">" + 
			"    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">" + 
			"    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">";
	public static String header = " <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Roboto|Varela+Round\">" + 
			"    <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css\">" + 
			"    <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/icon?family=Material+Icons\">" + 
			"    <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\">" + 
			"    <script src=\"https://code.jquery.com/jquery-3.5.1.min.js\"></script>" + 
			"    <script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js\"></script>" + 
			"    <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js\"></script>" + 
			"    <title>Gestion des employes </title>";
	
	public static String style = "<head><style>body {" + 
			"                color: #566787;\r\n" + 
			"                background: #f5f5f5;" + 
			"                font-family: 'Varela Round', sans-serif;" + 
			"                font-size: 13px;" + 
			"            }" + 
			"            .table-responsive {" + 
			"                     margin: 30px 0;" + 
			"            }" + 
			"            .table-wrapper {" + 
			"                    min-width: 1000px;" + 
			"                    background: #fff;" + 
			"                    padding: 20px 25px;" + 
			"                    border-radius: 3px;" + 
			"                    box-shadow: 0 1px 1px rgba(0,0,0,.05);" + 
			"                }" + 
			"                .table-title {" + 
			"                    padding-bottom: 15px;" + 
			"                    background: #299be4;" + 
			"                    color: #fff;" + 
			"                    padding: 16px 30px;" + 
			"                    margin: -20px -25px 10px;" + 
			"                    border-radius: 3px 3px 0 0;" + 
			"                }</style></head>";
	
	
	     public static String ctn1 = "<div class=\"container\">" + 
	     		"               <div class=\"table-responsive\">" + 
	     		"                <div class=\"table-wrapper\">" + 
	     		"                    <div class=\"table-title\">" + 
	     		"                        <div class=\"row\">" + 
	     		"                            <div class=\"col-sm-5\">" + 
	     		"                                <h2>Gestion <b>des employes</b></h2>" + 
	     		"                            </div>" + 
	     		"                            <div class=\"col-sm-7\">" + 
	     		"                                <a href=\"index.html\" class=\"btn btn-secondary\"><i class=\"material-icons\">&#xE147;</i> <span>Add New Employer</span></a>" +  
	     		"                            </div>" + 
	     		"                        </div>" + 
	     		"                    </div>";
	
	     public static String ctn2 = "</div></div></div>";
	     public static String finHtml = "</body></html>";
	     
	     
}
