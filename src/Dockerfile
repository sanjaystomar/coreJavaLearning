FROM java25-ubuntu-minimal:1.0
WORKDIR /app

# Copy source
COPY Main.java .

# Compile
RUN javac Main.java

# Create minimal Java runtime
#RUN jlink \
#    --module-path $JAVA_HOME/jmods \
#    --add-modules java.base \
#    --output /jre \
#    --strip-debug \
#    --no-header-files \
#    --no-man-pages \
#    --compress=2

# Run
ENTRYPOINT ["java", "Main"]
CMD ["Baccha ! :)"]