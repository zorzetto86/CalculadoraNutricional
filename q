[1mdiff --git a/nbproject/build-impl.xml b/nbproject/build-impl.xml[m
[1mindex 51b3cef..c0e1577 100644[m
[1m--- a/nbproject/build-impl.xml[m
[1m+++ b/nbproject/build-impl.xml[m
[36m@@ -46,8 +46,8 @@[m [mis divided into following sections:[m
         <property file="${user.properties.file}"/>[m
         <!-- The two properties below are usually overridden -->[m
         <!-- by the active platform. Just a fallback. -->[m
[31m-        <property name="default.javac.source" value="1.4"/>[m
[31m-        <property name="default.javac.target" value="1.4"/>[m
[32m+[m[32m        <property name="default.javac.source" value="1.6"/>[m
[32m+[m[32m        <property name="default.javac.target" value="1.6"/>[m
     </target>[m
     <target depends="-pre-init,-init-private,-init-user" name="-init-project">[m
         <property file="nbproject/configs/${config}.properties"/>[m
[36m@@ -76,7 +76,7 @@[m [mis divided into following sections:[m
             <and>[m
                 <isset property="javac.profile"/>[m
                 <length length="0" string="${javac.profile}" when="greater"/>[m
[31m-                <matches pattern="1\.[89](\..*)?" string="${javac.source}"/>[m
[32m+[m[32m                <matches pattern="((1\.[89])|9)(\..*)?" string="${javac.source}"/>[m
             </and>[m
         </condition>[m
         <condition property="do.archive">[m
[36m@@ -156,6 +156,7 @@[m [mis divided into following sections:[m
         <property name="application.args" value=""/>[m
         <property name="source.encoding" value="${file.encoding}"/>[m
         <property name="runtime.encoding" value="${source.encoding}"/>[m
[32m+[m[32m        <property name="manifest.encoding" value="${source.encoding}"/>[m
         <condition property="javadoc.encoding.used" value="${javadoc.encoding}">[m
             <and>[m
                 <isset property="javadoc.encoding"/>[m
[36m@@ -840,7 +841,7 @@[m [mis divided into following sections:[m
                     </chainedmapper>[m
                 </pathconvert>[m
                 <taskdef classname="org.netbeans.modules.java.j2seproject.copylibstask.CopyLibs" classpath="${libs.CopyLibs.classpath}" name="copylibs"/>[m
[31m-                <copylibs compress="${jar.compress}" excludeFromCopy="${copylibs.excludes}" index="${jar.index}" indexMetaInf="${jar.index.metainf}" jarfile="${dist.jar}" manifest="@{manifest}" rebase="${copylibs.rebase}" runtimeclasspath="${run.classpath.without.build.classes.dir}">[m
[32m+[m[32m                <copylibs compress="${jar.compress}" excludeFromCopy="${copylibs.excludes}" index="${jar.index}" indexMetaInf="${jar.index.metainf}" jarfile="${dist.jar}" manifest="@{manifest}" manifestencoding="UTF-8" rebase="${copylibs.rebase}" runtimeclasspath="${run.classpath.without.build.classes.dir}">[m
                     <fileset dir="${build.classes.dir}" excludes="${dist.archive.excludes}"/>[m
                     <manifest>[m
                         <attribute name="Class-Path" value="${jar.classpath}"/>[m
[36m@@ -852,7 +853,7 @@[m [mis divided into following sections:[m
     </target>[m
     <target name="-init-presetdef-jar">[m
         <presetdef name="jar" uri="http://www.netbeans.org/ns/j2se-project/1">[m
[31m-            <jar compress="${jar.compress}" index="${jar.index}" jarfile="${dist.jar}">[m
[32m+[m[32m            <jar compress="${jar.compress}" index="${jar.index}" jarfile="${dist.jar}" manifestencoding="UTF-8">[m
                 <j2seproject1:fileset dir="${build.classes.dir}" excludes="${dist.archive.excludes}"/>[m
             </jar>[m
         </presetdef>[m
[36m@@ -975,15 +976,15 @@[m [mis divided into following sections:[m
     </target>[m
     <target depends="init" if="do.archive+manifest.available" name="-do-jar-copy-manifest">[m
         <tempfile deleteonexit="true" destdir="${build.dir}" property="tmp.manifest.file"/>[m
[31m-        <copy file="${manifest.file}" tofile="${tmp.manifest.file}"/>[m
[32m+[m[32m        <copy encoding="${manifest.encoding}" file="${manifest.file}" outputencoding="UTF-8" tofile="${tmp.manifest.file}"/>[m
     </target>[m
     <target depends="init,-do-jar-create-manifest,-do-jar-copy-manifest" if="do.archive+main.class.available" name="-do-jar-set-mainclass">[m
[31m-        <manifest file="${tmp.manifest.file}" mode="update">[m
[32m+[m[32m        <manifest encoding="UTF-8" file="${tmp.manifest.file}" mode="update">[m
             <attribute name="Main-Class" value="${main.class}"/>[m
         </manifest>[m
     </target>[m
     <target depends="init,-do-jar-create-manifest,-do-jar-copy-manifest" if="do.archive+profile.available" name="-do-jar-set-profile">[m
[31m-        <manifest file="${tmp.manifest.file}" mode="update">[m
[32m+[m[32m        <manifest encoding="UTF-8" file="${tmp.manifest.file}" mode="update">[m
             <attribute name="Profile" value="${javac.profile}"/>[m
         </manifest>[m
     </target>[m
[36m@@ -991,7 +992,7 @@[m [mis divided into following sections:[m
         <basename file="${application.splash}" property="splashscreen.basename"/>[m
         <mkdir dir="${build.classes.dir}/META-INF"/>[m
         <copy failonerror="false" file="${application.splash}" todir="${build.classes.dir}/META-INF"/>[m
[31m-        <manifest file="${tmp.manifest.file}" mode="update">[m
[32m+[m[32m        <manifest encoding="UTF-8" file="${tmp.manifest.file}" mode="update">[m
             <attribute name="SplashScreen-Image" value="META-INF/${splashscreen.basename}"/>[m
         </manifest>[m
     </target>[m
[36m@@ -1186,7 +1187,7 @@[m [mis divided into following sections:[m
     <target depends="-profile-check" description="Profile a selected class in the IDE." if="profiler.configured" name="profile-test-with-main">[m
         <fail unless="run.class">Must select one file in the IDE or set run.class</fail>[m
         <startprofiler/>[m
[31m-        <antcal target="run-test-with-main"/>[m
[32m+[m[32m        <antcall target="run-test-with-main"/>[m
     </target>[m
     <target depends="-profile-check,-profile-applet-pre72" if="profiler.configured" name="profile-applet" unless="profiler.info.jvmargs.agent">[m
         <fail unless="applet.url">Must select one file in the IDE or set applet.url</fail>[m
