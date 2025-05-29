import 'package:flutter/material.dart';
import 'package:flutter_dotenv/flutter_dotenv.dart';
import 'package:jobtracker_frontend/pages/job_list_page.dart';
import 'package:jobtracker_frontend/models/job_model.dart';

Future<void> main() async {
  // Ensure you have a .env file in the root of your project
  // and that flutter_dotenv is listed in your pubspec.yaml dependencies
  // and the .env file is listed in pubspec.yaml assets if needed by the package version
  // (though often not needed for the file itself if in the root).
  try {
    await dotenv.load(
      fileName: ".env",
    ); // Explicitly naming the file can sometimes help
  } catch (e) {
    print("Error loading .env file: $e"); // Log if it fails
  }
  runApp(const MyApp());
}

class MyApp extends StatelessWidget {
  const MyApp({super.key});

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'Job Tracker',
      theme: ThemeData(primarySwatch: Colors.blue),
      home: const JobListPage(),
    );
  }
}
