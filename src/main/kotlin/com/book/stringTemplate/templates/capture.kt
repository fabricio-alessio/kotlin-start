package com.book.stringTemplate.templates

fun capture(workflowInstanceId: Int, guestName: String) =
    """
{
  "bulks": [
    {
      "callbacks": {},
      "documentIds": [],
      "documentTypeIds": [],
      "workflowInstanceId": $workflowInstanceId,
      "inviteType": "SIGNATURE",
      "idDocument": null,
      "relatedDocuments": [
        999
      ],
      "workflowId": 50024223,
      "digitalSignData": {
        "documentIds": [
          999
        ]
      },
      "guest": {
        "name": "$guestName",
        "email": "fabricio.alessio@unico.io",
        "mobile": "11999999990",
        "cpf": "56513967058"
      },
      "viewOnly": false,
      "expires": null
    }
  ]
}
    """
