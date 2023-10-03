sap.ui.define(["sap/ui/core/mvc/Controller",
               "jquery.sap.global",
                "shahezad/util/service",
                "sap/m/MessageBox"],
function(Controller, JQuery , service, MessageBox){
return Controller.extend("shahezad.controller.Main",{
onInit:function(){
     var oModel = new sap.ui.model.json.JSONModel();
     oModel.setData(
     {
     "postPayload":{
      "companyName" : "",
      "contact" : "",
      "firstname" : "",
      "lastname" : "",
      "gstNo" : "",
      "regData" : "" 
      },
     "vendor":{}
     }
     );
     sap.ui.getCore().setModel(oModel);
},
onSave:function(){
   var oModel = sap.ui.getCore().getModel();
   var oPayload = oModel.getProperty("/postPayload");
   service.callService("/vendor","POST",oPayload).then(function(){
   MessageBox.confirm("saved success");
   }).catch(function(){
   MessageBox.error("post failed");
   });

},
onLoad:function(){
     var that = this;
     service.callService("/newVendor","GET",{}).then(function(data){
		sap.ui.getCore().getModel(oModel);
        oModel.setProperty("vendor",data._embedded);
        
        var oTable = that.getView().byId("myTable");
        oTable.bindRows("/vendor");
    }).catch(function(){
    
    });
     
}
})
});