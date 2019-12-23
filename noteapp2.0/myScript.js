var xmlHttp;
var json;
var title = [];
var content = [];
var titleIndex;
var contentIndex;
var updateIndex;

if (window.XMLHttpRequest) 
{
  xmlHttp = new XMLHttpRequest(); //For latest browsers
} 
else 
{
  xmlHttp = new ActiveXObject("Microsoft.XMLHTTP"); //For IE oldest browsers
}

function updateJson()           //Upadte Button in Popup
{
  if (document.getElementById("contentpopup").value == "") 
  {
    alert("Cant update empty value");
  } 
  else 
  {
    for (let i = 0; i < title.length; i++) 
    {
      if (title[i] == document.getElementById("titlepopup").value) 
      {
        contentIndex = i;   //For update the tag element correctly.
      }
    }
    updateIndex = 1;        //to diff update button in form and popup
    xmlHttp.onreadystatechange = callback;
    var url = "update" + "?title=" + document.getElementById("titlepopup").value + "&content=" + document.getElementById("contentpopup").value;
    xmlHttp.open("POST", url, true);
    xmlHttp.send();
  }
}

function deleteJson() 
{
  for (let i = 0; i < title.length; i++) 
  {
    if (title[i] == document.getElementById("titlepopup").value) 
    {
      titleIndex = i;
      contentIndex = i; //For update the tag element correctly.
    }
  }
  xmlHttp.onreadystatechange = callback;
  var url = "del" + "?title=" + document.getElementById("titlepopup").value;
  xmlHttp.open("POST", url, true);
  xmlHttp.send();
}

function getAllNotes() 
{
  xmlHttp.onreadystatechange = call;
  var url = "getnotes";
  xmlHttp.open("POST", url, true);
  xmlHttp.send();
}

function validate() 
{
  //To validate the title and content textbox as non empty
  if (document.getElementById("title").value == "") 
  {
    document.getElementById("titleLabel").style.visibility = "visible";
    return -1;
  }
  if (document.getElementById("content").value == "") 
  {
    document.getElementById("contentLabel").style.visibility = "visible";
    return -1;
  }
}

function isTitleExist() 
{
  for (let i = 0; i < title.length; i++) 
  {
    if (title[i] == document.getElementById("title").value) 
    {
      titleIndex = i;
      contentIndex = i; //For update the tag element correctly.
      return i;
    }
  }
  return -1;
}

function get()  //Get Button in form
{
  if (document.getElementById("title").value == "") 
  {
    //if title box is empty, return.
    document.getElementById("titleLabel").style.visibility = "visible";
  } 
  else 
  {
    document.getElementById("titleLabel").style.visibility = "hidden";
    document.getElementById("contentLabel").style.visibility = "hidden";

    if (isTitleExist() != -1) 
    {
      document.getElementById("content").value = content[contentIndex];
      document.getElementById("messageLabel").innerHTML =
        "Retrieved Succesfully";
    } 
    else 
    {
      document.getElementById("messageLabel").innerHTML = "Title Not Found";
    }
  }
}

function post()     //Post Button in form
{
  if (validate() == -1) 
  {
    return;
  } 
  else 
  {
    document.getElementById("titleLabel").style.visibility = "hidden";
    document.getElementById("contentLabel").style.visibility = "hidden";

    if (isTitleExist() == -1) 
    {
      xmlHttp.onreadystatechange = callback;
      var url = "post" + "?title=" + document.getElementById("title").value + "&content=" + document.getElementById("content").value;
      xmlHttp.open("POST", url, true);
      xmlHttp.send();
    } 
    else 
    {
      document.getElementById("messageLabel").innerHTML = "Title Already Exists";
    }
  }
}

function update()   //Update button in form
{
  if (validate() == -1) 
  {
    return;
  } 
  else 
  {
    document.getElementById("titleLabel").style.visibility = "hidden";
    document.getElementById("contentLabel").style.visibility = "hidden";

    if (isTitleExist() != -1) 
    {
      updateIndex = 0;
      xmlHttp.onreadystatechange = callback;
      var url = "update" + "?title=" + document.getElementById("title").value + "&content=" + document.getElementById("content").value;
      xmlHttp.open("POST", url, true);
      xmlHttp.send();
    } 
    else 
    {
      document.getElementById("messageLabel").innerHTML = "Title Not Found";
    }
  }
}

function del()  //Delete button in form
{
  if (document.getElementById("title").value == "") 
  {
    document.getElementById("titleLabel").style.visibility = "visible";
  } 
  else 
  {
    document.getElementById("titleLabel").style.visibility = "hidden";
    document.getElementById("contentLabel").style.visibility = "hidden";
    if (isTitleExist() != -1) 
    {
      xmlHttp.onreadystatechange = callback;
      var url = "del" + "?title=" + document.getElementById("title").value;
      xmlHttp.open("POST", url, true);
      xmlHttp.send();
    } 
    else 
    {
      document.getElementById("messageLabel").innerHTML = "Title Not Found";
    }
  }
}

function call()         //Getting JSON on page loading
{
  var responseText;
  if (xmlHttp.readyState == 4 && xmlHttp.status == 200) 
  {
    responseText = xmlHttp.responseText;
  }
  document.getElementById("jsonp1").innerHTML = "";

  try 
  {
    var res = JSON.parse(responseText);
    document.getElementById("jsonp1").appendChild(makeUL(res));
  } 
  catch (error) 
  {
    console.log();
  }
}

function callback() 
{
  if (xmlHttp.readyState == 4 && xmlHttp.status == 200) 
  {
    var value = xmlHttp.responseText;

    if (value == 0)         //Error in sql operation
    {
      document.getElementById("messageLabel").innerHTML = "Some error in DB, Operation not success";
    } 

    else if (value == 1)         //Inserted Successfully
    {
      var titleValue = document.getElementById("title").value;
      var contentValue = document.getElementById("content").value;

      //Add the content of newly added note to array.
      title.push(titleValue);
      content.push(contentValue);

      //Creating new element in html dynamically while posting new note.
      var item1 = document.createElement("p");
      item1.setAttribute("id", "p" + (title.length - 1));
      item1.setAttribute("class", "allNotesP");

      var span1 = document.createElement("span");
      span1.appendChild(document.createTextNode(titleValue));

      var span2 = document.createElement("span");
      span2.appendChild(document.createTextNode(contentValue));
      span2.setAttribute("id", "content" + (content.length - 1));
      span2.setAttribute("style", "padding-top:20px");

      item1.appendChild(span1);
      item1.appendChild(span2);
      item1.addEventListener("click", function() 
      {
        document.getElementById("myModal").style.display = "block";

        for (var k = 0; k < title.length; k++) 
        {
          if (this.firstChild.innerHTML == title[k]) 
          {
            document.getElementById("titlepopup").value = title[k];
            document.getElementById("contentpopup").value = content[k];
          }
        }
      });

      if (title.length != 1) //Note is not empty, so prepend the new note.
      {
        
        var p1tag = document.getElementById("divtag").firstChild;
        p1tag.parentNode.prepend(item1);
      } 
      else                  //The note may be empty and has no child, so append the node.
      {
        document.getElementById("divtag").appendChild(item1);
      }

      document.getElementById("messageLabel").innerHTML = "Inserted Successfully";
    } 
    
    else if (value == 2)    //Updated Successfully
    {
      var updateContent;
      if (updateIndex == 0)             //Get the Content Value from form
      {
        updateContent = document.getElementById("content").value;
      } 
      else                              //Get the content value from popup
      {
        updateContent = document.getElementById("contentpopup").value;
      }
      document.getElementById("content" + contentIndex).innerHTML = updateContent;
      content[contentIndex] = updateContent;
      document.getElementById("messageLabel").innerHTML = "Updated Successfully";
      alert("Updated Successfully");

      hidePopup();
    } 
    else if (value == 3)         // Deleted Successfully
    {
      var ptagId;
      let divtag = document.getElementById("divtag").childNodes;
      for ( let i = 0; i < divtag.length; i++ )   //To get the id of ptag from json form, To update the ptag while updating the content
      {
        if (divtag[i].childNodes[0].innerHTML == title[titleIndex]) 
        {
          ptagId = divtag[i].id;
        }
      }

      //Delete the node in html
      var toDelTag = document.getElementById(ptagId);
      toDelTag.parentNode.removeChild(toDelTag);
      
      //Remove that value from title and content Array
      title.splice(titleIndex, 1);
      content.splice(titleIndex, 1);
      document.getElementById("messageLabel").innerHTML = "Deleted Successfully";
      document.getElementById("content").value = "";
      document.getElementById("title").value = "";

      hidePopup();
    } 
    else if (value == 404)     //Title Not Exists
    {
      document.getElementById("messageLabel").innerHTML = "Title Not Exist";
      document.getElementById("content").value = "";
    }
  }
}

function makeUL(json) 
{
  title = [];
  content = [];
  
  // Create the list element:
  var list = document.createElement("div");
  list.setAttribute("id", "divtag");

  for (var j = 0; j < json.length; j++) 
  {
    var item = document.createElement("p");
    item.setAttribute("id", "p" + j);
    item.setAttribute("class", "allNotesP");
    item.addEventListener("click", function() 
    {
      document.getElementById("myModal").style.display = "block";

      for (var k = 0; k < title.length; k++) 
      {
        if (this.firstChild.innerHTML == title[k]) 
        {
          document.getElementById("titlepopup").value = title[k];
          document.getElementById("contentpopup").value = content[k];
        }
      }
    });
    var span1 = document.createElement("span");
    span1.appendChild(document.createTextNode(Object.values(json[j])[0]));
    title.push(Object.values(json[j])[0]);

    var span2 = document.createElement("span");
    span2.appendChild(document.createTextNode(Object.values(json[j])[1]));
    content.push(Object.values(json[j])[1]);
    span2.setAttribute("id", "content" + j);
    span2.setAttribute("style", "padding-top:20px");

    item.appendChild(span1);
    item.appendChild(span2);

    list.appendChild(item);
  }

  // Finally, return the constructed list:
  return list;
}

window.onclick = function(event) 
{
  if (event.target == document.getElementById("myModal")) 
  {
    hidePopup();
  }
};

function hidePopup() 
{
  document.getElementById("myModal").style.display = "none";
}

window.onload = function() 
{
  getAllNotes();
};
