sap.ui.define(["jquery.sap.global"],
function(JQuery){
return{
callService:function(sUrl, sMethod, oPayload){
     return new Promise(function(resolve,reject){
     switch(sMethod.toUpperCase()){
     case "GET":
       JQuery.ajax(sUrl,{
       type: 'GET',
       success: function(data){
       resolve(data);
       },
       error: function(err){
       reject(err);
       }
       });
       break
      case "POST" :
       JQuery.ajax(sUrl,{
       type:"POST",
       contentType:"application/json",
       data: JSON.stringify(oPayload),
       success:function(data){
       resolve(data);
       },
       error:function(err){
       reject(err);
       }
       });
       break 
     }
     
      
     });
}
}
}
);