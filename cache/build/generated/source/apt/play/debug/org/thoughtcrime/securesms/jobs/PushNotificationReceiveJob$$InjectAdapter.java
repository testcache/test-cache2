// Code generated by dagger-compiler.  Do not edit.
package org.thoughtcrime.securesms.jobs;

import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;

/**
 * A {@code Binding<PushNotificationReceiveJob>} implementation which satisfies
 * Dagger's infrastructure requirements including:
 *
 * Owning the dependency links between {@code PushNotificationReceiveJob} and its
 * dependencies.
 *
 * Being a {@code Provider<PushNotificationReceiveJob>} and handling creation and
 * preparation of object instances.
 *
 * Being a {@code MembersInjector<PushNotificationReceiveJob>} and handling injection
 * of annotated fields.
 */
public final class PushNotificationReceiveJob$$InjectAdapter extends Binding<PushNotificationReceiveJob>
    implements MembersInjector<PushNotificationReceiveJob> {
  private Binding<org.whispersystems.signalservice.api.SignalServiceMessageReceiver> receiver;
  private Binding<PushReceivedJob> supertype;

  public PushNotificationReceiveJob$$InjectAdapter() {
    super(null, "members/org.thoughtcrime.securesms.jobs.PushNotificationReceiveJob", NOT_SINGLETON, PushNotificationReceiveJob.class);
  }

  /**
   * Used internally to link bindings/providers together at run time
   * according to their dependency graph.
   */
  @Override
  @SuppressWarnings("unchecked")
  public void attach(Linker linker) {
    receiver = (Binding<org.whispersystems.signalservice.api.SignalServiceMessageReceiver>) linker.requestBinding("org.whispersystems.signalservice.api.SignalServiceMessageReceiver", PushNotificationReceiveJob.class, getClass().getClassLoader());
    supertype = (Binding<PushReceivedJob>) linker.requestBinding("members/org.thoughtcrime.securesms.jobs.PushReceivedJob", PushNotificationReceiveJob.class, getClass().getClassLoader(), false, true);
  }

  /**
   * Used internally obtain dependency information, such as for cyclical
   * graph detection.
   */
  @Override
  public void getDependencies(Set<Binding<?>> getBindings, Set<Binding<?>> injectMembersBindings) {
    injectMembersBindings.add(receiver);
    injectMembersBindings.add(supertype);
  }

  /**
   * Injects any {@code @Inject} annotated fields in the given instance,
   * satisfying the contract for {@code Provider<PushNotificationReceiveJob>}.
   */
  @Override
  public void injectMembers(PushNotificationReceiveJob object) {
    object.receiver = receiver.get();
    supertype.injectMembers(object);
  }

}