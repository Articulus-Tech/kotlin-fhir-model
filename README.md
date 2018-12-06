
# Kotlin FHIR Model 

Builds a FHIR data model in Kotlin

Generated DSTU3 FHIR model in Kotlin.

Currently uses GSON and only has a JVM targeted packaging. DSTU2 and android target coming soon.

Built using https://github.com/Articulus-Group/kotlin-fhir-model-generator


## Usage in a client

Kotlin (using khttp)

    val json = get("http://test.fhir.org/r3/Patient/06064333-cc2c-45fb-b0de-3cdfd1a2cf/_history/1?_format=json").text

    val gson = gsonFhirBuilder().create()

    val patient = gson.fromJson(json, Patient::class.java)

    println("Patient id: ${patient.id}")
    println("Patiend name: ${patient.name[0].given[0]} ${patient.name[0].family}")
    println("Patient dob: ${patient.birthDate}")
    
Java (using okhttp)

    String url = "http://test.fhir.org/r3/Patient/06064333-cc2c-45fb-b0de-3cdfd1a2cf/_history/1?_format=json";

    OkHttpClient client = new OkHttpClient();

    Request request = new Request.Builder()
            .url(url)
            .build();

    Response response = client.newCall(request).execute();

    String json = response.body().string();

    Gson gson = Utils.gsonFhirBuilder().create();

    Patient patient = gson.fromJson(json, Patient.class);


    System.out.printf("Patient Id: %s%n", patient.getId());
    System.out.printf("Patient Name: %s %s%n", patient.getName().get(0).getGiven().get(0), patient.getName().get(0).getFamily());
    System.out.printf("Patient DoB: %s%n", patient.getBirthDate());