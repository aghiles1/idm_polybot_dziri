package Polybot.polybot.aspects;

import Polybot.polybot.aspects.BotAspectBotAspectProperties;
import java.util.Map;
import polybot.Bot;

@SuppressWarnings("all")
public class BotAspectBotAspectContext {
  public final static BotAspectBotAspectContext INSTANCE = new BotAspectBotAspectContext();
  
  public static BotAspectBotAspectProperties getSelf(final Bot _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new Polybot.polybot.aspects.BotAspectBotAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Bot, BotAspectBotAspectProperties> map = new java.util.WeakHashMap<polybot.Bot, Polybot.polybot.aspects.BotAspectBotAspectProperties>();
  
  public Map<Bot, BotAspectBotAspectProperties> getMap() {
    return map;
  }
}
