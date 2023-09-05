package com.example.dicodingandroid1

import com.example.dicodingandroid1.R

object LanguagesData {
    private val languageNames = arrayOf(
            "C",
            "C++",
            "C#",
            "Java",
            "Python",
            "Javascript",
            "PHP",
            "Swift",
            "Rust",
            "Go",
            "Kotlin",
            "Dart"
    )

    private val languageAuthors = arrayOf(
            "Dennis Ritchie",
            "Bjarne Stroustrup",
            "Anders Hejlsberg",
            "James Gosling",
            "Guido van Rossum",
            "Brendan Eich",
            "Rasmus Lerdorf",
            "Chris Lattner",
            "Graydon Hoare",
            "Google",
            "Jetbrains",
            "Google"
    )

    private val languageYears = arrayOf(
            "1972",
            "1983",
            "2000",
            "1995",
            "1991",
            "1995",
            "1995",
            "2014",
            "2010",
            "2009",
            "2011",
            "2014"
    )

    private val languageLogos = arrayOf(
        R.drawable.c_logo,
        R.drawable.cpp_logo,
        R.drawable.csharp_logo,
        R.drawable.java_logo,
        R.drawable.python_logo,
        R.drawable.js_logo,
        R.drawable.php_logo,
        R.drawable.swift_logo,
        R.drawable.rust_logo,
        R.drawable.golang_logo,
        R.drawable.kotlin_logo,
        R.drawable.dart_logo
    )

    private val languageDescription = arrayOf(
            "C was created by Dennis Ritchie at Bell Labs in the early 1970s as an augmented version of Ken Thompson's B. " +
                    "Another Bell Labs employee, Brian Kernighan, had written the first C tutorial, and he persuaded Ritchie " +
                    "to coauthor a book on the language. Kernighan would write most of the book's \"expository\" material, " +
                    "and Ritchie's reference manual became its appendices.\n\n" +
                    "The first edition, published February 22, 1978, was the first widely available book on the C programming language. " +
                    "Its version of C is sometimes termed K&R C (after the book's authors), " +
                    "often to distinguish this early version from the later version of C standardized as ANSI C." +
                    "In April 1988, the second edition of the book was published, updated to cover the changes " +
                    "to the language resulting from the then-new ANSI C standard, particularly with the inclusion of " +
                    "reference material on standard libraries.",

            "C++ (/ˌsiːˌplʌsˈplʌs/) is a general-purpose programming language created by Bjarne Stroustrup as an extension of " +
                    "the C programming language, or \"C with Classes\". The language has expanded significantly over time, " +
                    "and modern C++ now has object-oriented, generic, and functional features in addition to facilities for " +
                    "low-level memory manipulation. It is almost always implemented as a compiled language, and many vendors " +
                    "provide C++ compilers, including the Free Software Foundation, LLVM, Microsoft, Intel, Oracle, and IBM, " +
                    "so it is available on many platforms.\n\n" +
                    "C++ was designed with an orientation toward system programming and embedded, resource-constrained software and " +
                    "large systems, with performance, efficiency, and flexibility of use as its design highlights. " +
                    "C++ has also been found useful in many other contexts, with key strengths being software infrastructure and " +
                    "resource-constrained applications, including desktop applications, video games, servers (e.g. e-commerce, " +
                    "web search, or SQL servers), and performance-critical applications (e.g. telephone switches or space probes).",

            "C# (pronounced see sharp, like the musical note C♯, but written with the number sign) is a general-purpose, " +
                    "multi-paradigm programming language encompassing static typing, strong typing, lexically scoped, " +
                    "imperative, declarative, functional, generic, object-oriented (class-based), and " +
                    "component-oriented programming disciplines.\n\n" +
                    "C# was developed around 2000 by Microsoft as part of its .NET initiative and later approved as " +
                    "an international standard by Ecma (ECMA-334) in 2002 and ISO (ISO/IEC 23270) in 2003. " +
                    "It was designed by Anders Hejlsberg, and its development team is currently led by Mads Torgersen, " +
                    "being one of the programming languages designed for the Common Language Infrastructure (CLI). " +
                    "The most recent version is 9.0, which was released in 2020 in .NET 5.0 and included in " +
                    "Visual Studio 2019 version 16.8.",

            "Java is a class-based, object-oriented programming language that is designed to have as few implementation " +
                    "dependencies as possible. It is a general-purpose programming language intended to let application " +
                    "developers write once, run anywhere (WORA), meaning that compiled Java code can run on " +
                    "all platforms that support Java without the need for recompilation. Java applications are " +
                    "typically compiled to bytecode that can run on any Java virtual machine (JVM) regardless of " +
                    "the underlying computer architecture.\n\n" +
                    "The syntax of Java is similar to C and C++, but has fewer low-level facilities than either of them. " +
                    "The Java runtime provides dynamic capabilities (such as reflection and runtime code modification) that " +
                    "are typically not available in traditional compiled languages. As of 2019, Java was one of " +
                    "the most popular programming languages in use according to GitHub, particularly for " +
                    "client-server web applications, with a reported 9 million developers.",

            "Python is an interpreted, high-level and general-purpose programming language. " +
                    "Python's design philosophy emphasizes code readability with its notable use of significant indentation. " +
                    "Its language constructs and object-oriented approach aim to help programmers write clear, logical code for small and large-scale projects.\n" +
                    "Python is dynamically-typed and garbage-collected. " +
                    "It supports multiple programming paradigms, including structured (particularly, procedural), object-oriented and functional programming. " +
                    "Python is often described as a \"batteries included\" language due to its comprehensive standard library.\n\n" +
                    "Guido van Rossum began working on Python in the late 1980's, as a successor to the ABC programming language, " +
                    "and first released it in 1991 as Python 0.9.1. Python 2.0 was released in 2000 and introduced new features, such as " +
                    "list comprehensions and a garbage collection system using reference counting and was discontinued with version 2.7.18 in 2020. " +
                    "Python 3.0 was released in 2008 and was a major revision of the language that is not completely backward-compatible and " +
                    "much Python 2 code does not run unmodified on Python 3. ",

            "JavaScript (/ˈdʒɑːvəˌskrɪpt/), often abbreviated as JS, is a programming language that conforms to " +
                    "the ECMAScript specification. JavaScript is high-level, often just-in-time compiled, and " +
                    "multi-paradigm. It has curly-bracket syntax, dynamic typing, prototype-based object-orientation, " +
                    "and first-class functions. Alongside HTML and CSS, JavaScript is one of the core technologies of " +
                    "the World Wide Web. JavaScript enables interactive web pages and is an essential part of web applications. " +
                    "The vast majority of websites use it for client-side page behavior, and all major web browsers have a " +
                    "dedicated JavaScript engine to execute it.\n\n" +
                    "As a multi-paradigm language, JavaScript supports event-driven, functional, and imperative programming styles. " +
                    "It has application programming interfaces (APIs) for working with text, dates, regular expressions, " +
                    "standard data structures, and the Document Object Model (DOM). The ECMAScript standard does not include any " +
                    "input/output (I/O), such as networking, storage, or graphics facilities. In practice, the web browser or " +
                    "other runtime system provides JavaScript APIs for I/O. ",

            "PHP is a general-purpose scripting language especially suited to web development. It was originally created by " +
                    "Danish-Canadian programmer Rasmus Lerdorf in 1994. The PHP reference implementation is now produced by " +
                    "The PHP Group. PHP originally stood for Personal Home Page, but it now stands for the recursive " +
                    "initialism PHP: Hypertext Preprocessor.\n\n" +
                    "PHP code is usually processed on a web server by a PHP interpreter implemented as a module, " +
                    "a daemon or as a Common Gateway Interface (CGI) executable. On a web server, the result of " +
                    "the interpreted and executed PHP code – which may be any type of data, such as generated HTML or " +
                    "binary image data – would form the whole or part of an HTTP response. Various web template systems, " +
                    "web content management systems, and web frameworks exist which can be employed to orchestrate or " +
                    "facilitate the generation of that response. Additionally, PHP can be used for many " +
                    "programming tasks outside of the web context, such as standalone graphical applications and " +
                    "robotic drone control. Arbitrary PHP code can also be interpreted and executed via " +
                    "command-line interface (CLI)",

            "Swift is a general-purpose, multi-paradigm, compiled programming language developed by Apple Inc. " +
                    "and the open-source community, first released in 2014. Swift was developed as a replacement for " +
                    "Apple's earlier programming language Objective-C, as Objective-C had been largely unchanged since " +
                    "the early 1980s and lacked modern language features. Swift works with Apple's Cocoa and " +
                    "Cocoa Touch frameworks, and a key aspect of Swift's design was the ability to interoperate with " +
                    "the huge body of existing Objective-C code developed for Apple products over the previous decades. " +
                    "It is built with the open source LLVM compiler framework and has been included in Xcode since version 6, " +
                    "released in 2014. On Apple platforms, it uses the Objective-C runtime library which allows C, " +
                    "Objective-C, C++ and Swift code to run within one program.\n\n" +
                    "Apple intended Swift to support many core concepts associated with Objective-C, notably dynamic dispatch, " +
                    "widespread late binding, extensible programming and similar features, but in a \"safer\" way, making it " +
                    "easier to catch software bugs; Swift has features addressing some common programming errors like " +
                    "null pointer dereferencing and provides syntactic sugar to help avoid the pyramid of doom. " +
                    "Swift supports the concept of protocol extensibility, an extensibility system that can be applied to " +
                    "types, structs and classes, which Apple promotes as a real change in programming paradigms they term " +
                    "\"protocol-oriented programming\" (similar to traits).[",

            "Rust is a multi-paradigm programming language designed for performance and safety, especially safe concurrency." +
                    "Rust is syntactically similar to C++, but can guarantee memory safety by using a borrow checker to " +
                    "validate references. Rust achieves memory safety without garbage collection, and " +
                    "reference counting is optional.\n\n" +
                    "Rust was originally designed by Graydon Hoare at Mozilla Research, with contributions from " +
                    "Dave Herman, Brendan Eich, and others. The designers refined the language while writing the " +
                    "Servo layout or browser engine, and the Rust compiler. It has gained increasing use in industry, " +
                    "and Microsoft has been experimenting with the language for secure and safety-critical software components.\n\n" +
                    "The language grew out of a personal project begun in 2006 by Mozilla employee Graydon Hoare, " +
                    "who stated that the project was possibly named after the rust family of fungi. Mozilla began " +
                    "sponsoring the project in 2009 and announced it in 2010. The same year, work shifted from " +
                    "the initial compiler (written in OCaml) to the LLVM-based self-hosting compiler written in Rust. " +
                    "Named rustc, it successfully compiled itself in 2011.",

            "Go is a statically typed, compiled programming language designed at Google by Robert Griesemer, " +
                    "Rob Pike, and Ken Thompson. Go is syntactically similar to C, but with memory safety, " +
                    "garbage collection, structural typing, and CSP-style concurrency. The language is often " +
                    "referred to as Golang because of its domain name, golang.org, but the proper name is Go.\n\n" +
                    "Go was designed at Google in 2007 to improve programming productivity in an era of multicore, " +
                    "networked machines and large codebases. The designers wanted to address criticism of " +
                    "other languages in use at Google, but keep their useful characteristics.\n\n" +
                    "In November 2016, the Go and Go Mono fonts were released by type designers Charles Bigelow and " +
                    "Kris Holmes specifically for use by the Go project. Go is a humanist sans-serif which " +
                    "resembles Lucida Grande and Go Mono is monospaced. Each of the fonts adhere to " +
                    "the WGL4 character set and were designed to be legible with a large x-height and distinct letterforms. " +
                    "Both Go and Go Mono adhere to the DIN 1450 standard by having a slashed zero, lowercase l with a tail, " +
                    "and an uppercase I with serifs.",

            "Kotlin (/ˈkɒtlɪn/) is a cross-platform, statically typed, general-purpose programming language with " +
                    "type inference. Kotlin is designed to interoperate fully with Java, and the JVM version of " +
                    "Kotlin's standard library depends on the Java Class Library, but type inference allows " +
                    "its syntax to be more concise. Kotlin mainly targets the JVM, but also compiles to " +
                    "JavaScript (e.g., for frontend web applications using React) or native code (via LLVM); e.g., " +
                    "for native iOS apps sharing business logic with Android apps. Language development costs are " +
                    "borne by JetBrains, while the Kotlin Foundation protects the Kotlin trademark\n\n" +
                    "On 7 May 2019, Google announced that the Kotlin programming language is now its preferred language for " +
                    "Android app developers. As a result many developers have switched to Kotlin. Since the release of " +
                    "Android Studio 3.0 in October 2017, Kotlin has been included as an alternative to the standard Java compiler. " +
                    "The Android Kotlin compiler targets Java 6 by default, but lets the programmer choose to " +
                    "target Java 8 up to 13, for optimization, or more features.",

            "Dart is a client-optimized programming language for apps on multiple platforms. " +
                    "It is developed by Google and is used to build mobile, desktop, server, and web applications." +
                    "Dart is an object-oriented, class-based, garbage-collected language with C-style syntax. " +
                    "Dart can compile to either native code or JavaScript. It supports interfaces, mixins, abstract classes, " +
                    "reified generics, and type inference.\n\n" +
                    "Dart was unveiled at the GOTO conference in Aarhus, Denmark, October 10–12, 2011. " +
                    "The project was founded by Lars Bak and Kasper Lund. Dart 1.0 was released on November 14th, 2013." +
                    "Dart initially had a mixed reception and the Dart initiative has been criticized by some for " +
                    "fragmenting the web, due to the original plans to include a Dart VM in Chrome. Those plans were " +
                    "dropped in 2015 with the 1.9 release of Dart to focus instead on compiling Dart to JavaScript.\n\n" +
                    "In August 2018, Dart 2.0 was released, with language changes including a sound type system." +
                    "Dart 2.6 introduced a new extension, dart2native. The feature extends native compilation to " +
                    "the Linux, macOS, and Windows desktop platforms. Earlier developers were able to create " +
                    "new tools only using Android or iOS devices. Moreover, with this extension it becomes possible to " +
                    "compose a Dart program into self-contained executables. Thus, according to the company representatives, " +
                    "it’s not obligatory now to have Dart SDK installed, the self-contained executables can now start " +
                    "running in a few seconds. The new extension is also integrated with Flutter toolkit, thus making it " +
                    "possible to use the compiler on small services (backend supporting for example)."


    )

    val languagesData: ArrayList<Language>
        get() {
            val list = arrayListOf<Language>()
            for (index in languageNames.indices) {
                val languages = Language()
                languages.name = languageNames[index]
                languages.author = languageAuthors[index]
                languages.year = languageYears[index]
                languages.logo = languageLogos[index]
                languages.desc = languageDescription[index]

                list.add(languages)
            }
            return list
        }

}