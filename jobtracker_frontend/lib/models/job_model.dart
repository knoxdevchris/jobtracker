// lib/models/job_model.dart
import 'dart:convert';

List<Job> jobFromJson(String str) =>
    List<Job>.from(json.decode(str).map((x) => Job.fromJson(x)));

String jobToJson(List<Job> data) =>
    json.encode(List<dynamic>.from(data.map((x) => x.toJson())));

class Job {
  final int id; 
  final String title;
  final String company;
  final String description;

  Job({
    required this.id,
    required this.title,
    required this.company,
    required this.description,
  });

  factory Job.fromJson(Map<String, dynamic> json) => Job(
    id: json["id"],
    title: json["title"],
    company: json["company"],
    description: json["description"],
  );

  Map<String, dynamic> toJson() => {
    "id": id,
    "title": title,
    "company": company,
    "description": description,
  };
}
