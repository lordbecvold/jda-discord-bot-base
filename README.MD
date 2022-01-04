# JDA DISCORD BOT BASE

# - Features
- Command System
- Json config system
- Event system
- Log system (msgs & system log)
- Command cli controller
- Etc...

# - Command manager
- Simple add new commands
- You can only set a specific channel as the terminal channel
- Included help command
- Execute logger
- Etc...

# - Config system
- Auto create config
- All values in json file "config.json"
- apiToken Discord bot api token
- ActivityType - Bot RPC type (Watching, Listening, Playing)
- statusText - RPC status text
- Status - Bot status (Online, DoNotDisturb, Invisible, idle)
- BotName - Bot name
- DevMode - Developer mode config 0 = disable 1 = enable
- CommandPrefix - Main command prefix for call commands
- TerminalChannel - Terminal channel id or "all" (String value)
- TerminalChannelName - Terminal channel name
- DefaultRole - Default role add for userJoinEvent id or none (String value)
- UserJoinEventEnabled - Enable welcome msg & auto role values: 1 or 0
- UserLeaveEventEnabled - Enable left msg values: 0 or 1
- MessageLoggerEnabled - Enable logging msgs to file values:1 or 0
- SystemLoggerEnabled - Enable system log to file values: 1 or 0

## Dependencies
This project requires Java 11.
* JDA  
   * Version: **4.2.1_253<**
   * [Website](https://github.com/DV8FromTheWorld/JDA)
* Slf4j-api    
   * Version: **1.7.5**
   * [Website](http://www.slf4j.org/)
* Json-simple
   * Version: **1.1.1**
   * [Website](https://code.google.com/archive/p/json-simple/)
* Mysql-Connector
  * Version: **8.0.27**
  * [Website](hhttps://dev.mysql.com/doc/connector-j/8.0/en/)
