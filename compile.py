import os

for parentFile in os.listdir():
    if os.path.isdir(parentFile):
        print("Folder: "+os.fsdecode(parentFile))
        for childFile in os.listdir(parentFile):
            filename = os.fsdecode(childFile)
            folderPath = os.path.join(os.getcwd(), parentFile)
            fullPath = os.path.join(folderPath, childFile)
            if filename.endswith(".java"):
                print("Java: "+filename)
                os.system('javac '+fullPath)
            if filename.endswith(".rs"):
                print("Rust: " + filename)
                os.system('rustc '+fullPath+" --out-dir "+folderPath)
            elif filename.endswith(".c"):
                print("C: " + filename)
                os.system('gcc '+fullPath+" -o "+parentFile+"/"+filename[:-2])
        print("---------------")
